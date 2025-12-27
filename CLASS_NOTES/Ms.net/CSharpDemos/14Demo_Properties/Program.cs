namespace _14Demo_Properties
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee emp = new Employee();
            emp.EId = 10; // invoke setter emp.set_EId()
            int id = emp.EId;// invoke getter emp.get_EID()
            Console.WriteLine($"ID  = {id} ");
            emp.EName = "Hugh Jackman";
            Console.WriteLine($"Output : {emp.EName}");
            emp.EAddress = "New York";
        }
    }
    public class Employee
    {
        private int _EId;
        private string _EName;
        private string _EAddress;
        
        public int EId
        {
            set 
            {
                _EId = value;
            }
            get 
            {
                return _EId;
            }
        }
        public string EName
        {
            set 
            {
                if (value != null)
                {
                    _EName = "Mr/Mrs." + value;
                }
                else
                {
                    _EName = "Invalid format";
                }
            }
            get { return _EName; }
        }

        public string EAddress
        {
            set
            {
                _EAddress = value;
                Console.WriteLine($"Address : {_EAddress}");
            }
            //get { return _EAddress; }
        }

     // Properties : - compiler will generate getter ans setter methods for you
        // Syntax:
        //accessModifier DataType PropertyName
        //{
        //    set
        //    {
        //        _PrivateMemeber = value;
        //    }
        //    get
        //    {
        //        return _PrivateMemeber;
        //    }
        //}

        #region Getters and Setters code : old approach
        //public void set_EId(int id)
        //{
        //    _EId = id;
        //}
        //public int get_EId()
        //{
        //    if( _EId == 0 )
        //        return _EId + 1;
        //    else
        //        return _EId;
        //}
        #endregion

    }
}
