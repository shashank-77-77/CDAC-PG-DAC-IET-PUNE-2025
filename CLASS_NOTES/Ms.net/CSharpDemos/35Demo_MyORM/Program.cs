using _34Demo_CustomAttributes;
using System.Reflection;

namespace _35Demo_MyORM
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string asmPath = @"D:\IET_Dec_25_Batch\CSharpDemos\33Demo_EmpLib\bin\Debug\net8.0\33Demo_EmpLib.dll";

            Assembly asm = Assembly.LoadFrom(asmPath);
            Type[] allTypes = asm.GetTypes();
            for (int i = 0; i < allTypes.Length; i++)
            {
                Type type = allTypes[i]; //Emp

                string createTableQuery = "CREATE TABLE ";

                Attribute[] allAttributes = type.GetCustomAttributes().ToArray();

                for (int j = 0; j < allAttributes.Length; j++)
                {
                    Attribute attr = allAttributes[j];
                    if (attr is TableAttribute)
                    {
                        TableAttribute tableAttr = attr as TableAttribute;
                        createTableQuery = createTableQuery + tableAttr.TableName + " ( ";
                        // CREATE TABLE Employee ( 
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
                        if ( pAttr is ColumnAttribute)
                        {
                            ColumnAttribute col = pAttr as ColumnAttribute;
                            // CREATE TABLE Employee ( 
                            createTableQuery = createTableQuery + col.ColumnName + " " + col.ColumnType + ",";
                        }
                        // CREATE TABLE Employee ( EId int, EName varchar(50), EAddress varchar(50) )
                    }                    
                }
                createTableQuery = createTableQuery.TrimEnd(',') + " )";
                Console.WriteLine(createTableQuery);

                string filePath = @"D:\IET_Dec_25_Batch\CSharpDemos\35Demo_MyORM\SQLQuery\CreateTableQueries.sql";

                File.WriteAllText(filePath, createTableQuery);

                Console.WriteLine("Done.");
            }
        }
    }
}
