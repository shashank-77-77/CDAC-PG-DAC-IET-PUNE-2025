using CustomAttributes;
using System.Reflection;

namespace MyORM
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string asmPath = @"C:\Users\IET\Desktop\soham sss\CDAC_PG-DAC\250845920083\MS_NET\CSharpDemos\EmpLib\bin\Debug\net8.0\EmpLib.dll";

            Assembly asm = Assembly.LoadFrom(asmPath);
            Type[] allTypes = asm.GetTypes();
            for (int i = 0; i < allTypes.Length; i++)
            {
                Type type = allTypes[i]; 

                string createTableQuery = "CREATE TABLE ";

                Attribute[] allAttributes = type.GetCustomAttributes().ToArray();

                for (int j = 0; j < allAttributes.Length; j++)
                {
                    Attribute attr = allAttributes[j];
                    if (attr is TableAttribute)
                    {
                        TableAttribute tableAttr = attr as TableAttribute;
                        createTableQuery = createTableQuery + tableAttr.TableName + " ( ";
                         
                    }
                }


                PropertyInfo[] allPeroperties = type.GetProperties();

                for (int k = 0; k < allPeroperties.Length; k++)
                {
                    PropertyInfo prop = allPeroperties[k];
                    Attribute[] propAttr = prop.GetCustomAttributes().ToArray();

                    for (int l = 0; l < propAttr.Length; l++)
                    {
                        Attribute pAttr = propAttr[l];
                        if (pAttr is ColumnAttribute)
                        {
                            ColumnAttribute col = pAttr as ColumnAttribute;
                            
                            createTableQuery = createTableQuery + col.ColumnName + " " + col.ColumnType + ",";
                        }
                       
                    }
                }
                createTableQuery = createTableQuery.TrimEnd(',') + " )";
                Console.WriteLine(createTableQuery);

                string filePath = @"C:\Users\IET\Desktop\soham sss\CDAC_PG-DAC\250845920083\MS_NET\CSharpDemos\MyORM\SQLQuery\CreateTableQueries.sql";

                File.WriteAllText(filePath, createTableQuery);

                Console.WriteLine("Done.");
            }
        }
    }
}
