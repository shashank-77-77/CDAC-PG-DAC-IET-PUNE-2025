//using System.Reflection;

//namespace _29Demo_Refelction
//{
//    internal class Program
//    {
//        static void Main(string[] args)
//        {
            

//            string assemblyPath = @"D:\IET_Dec_25_Batch\CSharpDemos\30Demo_MyMath\bin\Debug\net8.0\30Demo_MyMath.dll";

//            Assembly asm = Assembly.LoadFrom(assemblyPath);

//            Type[] allTypes = asm.GetTypes();

//            for (int i = 0; i < allTypes.Length; i++)
//            {
//                Type type = allTypes[i];//CMath

//                // System.Int32 Add(System.Int32 x, System.Int32 y)
//                string methodSignature = "";

//                MethodInfo[] allMethods = type.GetMethods();

//                for (int j = 0; j < allMethods.Length; j++)
//                {
//                    MethodInfo method = allMethods[j];
//                    // System.Int32 Add(
//                    methodSignature = method.ReturnType.ToString() + " " + method.Name + "(";
//                    //if (method.ReturnType.ToString() == "System.Int32")
//                    //{
//                    //    // int Add(
//                    //    methodSignature = "int" + " " + method.Name + "(";
//                    //}
//                   ParameterInfo[] allParameters = method.GetParameters();
//                    for (int k = 0; k < allParameters.Length; k++)
//                    {
//                        ParameterInfo parameter = allParameters[k];
//                        // System.Int32 Add( System.Int32 x,System.Int32 y,
//                        methodSignature = methodSignature + parameter.ParameterType.ToString() + " " + parameter.Name + ",";
//                    }
//                    // System.Int32 Add( System.Int32 x,System.Int32 y)
//                    methodSignature = methodSignature.TrimEnd(',') + ")";
//                    Console.WriteLine(methodSignature);
//                }
//            }
//        }
//    }
//}

