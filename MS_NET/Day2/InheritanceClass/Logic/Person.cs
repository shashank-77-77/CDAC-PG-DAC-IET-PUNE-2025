using System;
using System.Collections.Generic;
using System.Diagnostics.Contracts;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InheritanceClass.Logic
{
    internal class Person
    {
        public string fname;
        public string lname;
    }

    internal class Employee : Person
    {
        public int EmployeeId;

    }
}
