//using System.Reflection;

//namespace Reflection
//{
//    internal class Program
//    {
//        static void Main(string[] args)
//        {


//            string assemblyPath = @"C:\Users\IET\Desktop\soham sss\CDAC_PG-DAC\250845920083\MS_NET\CSharpDemos\MyMath\bin\Debug\net8.0\MyMath.dll";

//            Assembly asm = Assembly.LoadFrom(assemblyPath);

//            Type[] allTypes = asm.GetTypes();

//            for (int i = 0; i < allTypes.Length; i++)
//            {
//                Type type = allTypes[i];//CMath
//                //type.IsSerializable.ToString();

//                object dynamicallyCreatedObject = asm.CreateInstance(type.FullName);

//                // System.Int32 Add(System.Int32 x, System.Int32 y)
//                string methodSignature = "";

//                MethodInfo[] allMethods = type.GetMethods();

//                for (int j = 0; j < allMethods.Length; j++)
//                {
//                    MethodInfo method = allMethods[j];
//                    // System.Int32 Add(
//                    methodSignature = method.ReturnType.ToString() + " " + method.Name + "(";

//                    ParameterInfo[] allParameters = method.GetParameters();
//                    for (int k = 0; k < allParameters.Length; k++)
//                    {
//                        ParameterInfo parameter = allParameters[k];
//                        // System.Int32 Add( System.Int32 x,System.Int32 y,
//                        methodSignature = methodSignature + parameter.ParameterType.ToString() + " " + parameter.Name + ",";
//                    }

//                    // Paramaetrs runtime send to type.InvokeMember() 
//                    object[] inputValues = new object[allParameters.Length];

//                    for (int p = 0; p < allParameters.Length; p++)
//                    {
//                        ParameterInfo para = allParameters[p];
//                        Console.WriteLine($"Enter value for {para.Name} of type = {para.ParameterType.ToString()}");

//                        inputValues[p] = Convert.ChangeType(Console.ReadLine(), para.ParameterType);
//                    }

//                    // System.Int32 Add( System.Int32 x,System.Int32 y)
//                    methodSignature = methodSignature.TrimEnd(',') + ")";
//                    Console.WriteLine(methodSignature);

//                    object? result = type.InvokeMember(
//                        method.Name,
//                        BindingFlags.Public |
//                        BindingFlags.Instance |
//                        BindingFlags.InvokeMethod,
//                        null,
//                        dynamicallyCreatedObject,
//                        inputValues
//                        );
//                    Console.WriteLine($"{method.Name} = {result}");
//                }
//            }
//        }
//    }
//}