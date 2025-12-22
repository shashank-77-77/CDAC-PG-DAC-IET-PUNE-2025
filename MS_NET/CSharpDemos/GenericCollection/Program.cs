namespace GenericCollection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Emp emp1 = new Emp();
            emp1.EId = 11;
            emp1.EName = "Shashnk Mankar";
            emp1.EAddress = "Nagpur, India";

            Emp emp2 = new Emp();
            emp2.EId = 12;
            emp2.EName = "Soham Shelar";
            emp2.EAddress = "Satara";

            Emp emp3 = new Emp();
            emp3.EId = 13;
            emp3.EName = "Pratik harode";
            emp3.EAddress = "Mumbai";

            #region List<T>
            //List<Emp> emps = new List<Emp>();
            //emps.Add(emp1);
            //emps.Add(emp2);
            //emps.Add(emp3);

            //foreach (Emp emp in emps)
            //{
            //    Console.WriteLine($"Id: {emp.EId}, Name: {emp.EName}, Address : {emp.EAddress}");
            //}
            #endregion

            #region Dictionary<TKey, TValue>
            Dictionary<int, Emp> empDict = new Dictionary<int, Emp>();
            empDict.Add(emp1.EId, emp1);
            empDict.Add(emp2.EId, emp2);
            empDict.Add(emp3.EId, emp3);
            foreach (KeyValuePair<int, Emp> element in empDict)
            {
                Emp emp = element.Value;
                //element.Key
                Console.WriteLine($"Id: {emp.EId}, Name: {emp.EName}, Address : {emp.EAddress}");
            }
            foreach (int key in empDict.Keys)
            {
                Emp emp = empDict[key] as Emp;
                Console.WriteLine($"Key = {key}, Id: {emp.EId}, Name: {emp.EName}, Address : {emp.EAddress}");
            }
            //foreach (Emp emp in empDict.Values)
            //{

            //    Console.WriteLine($"Id: {emp.EId}, Name: {emp.EName}, Address : {emp.EAddress}");
            //} 
            #endregion

        }
    }
    public class Emp
    {
        private int _EId;
        private string _EName;
        private string _EAddress;

        public string EAddress
        {
            get { return _EAddress; }
            set { _EAddress = value; }
        }

        public string EName
        {
            get { return _EName; }
            set { _EName = value; }
        }
        public int EId
        {
            get { return _EId; }
            set { _EId = value; }
        }
    }
}
