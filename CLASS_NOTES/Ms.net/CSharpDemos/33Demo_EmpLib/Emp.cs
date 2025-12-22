using _31Demo_BVSAttribute;
using _34Demo_CustomAttributes;
using System;

namespace _33Demo_EmpLib
{
    #region refer for demo: 32Demo_MyApplication
    //[BonaventureSystems(CompanyName = "BVS", DeveloperName = "Mugdha Panhale")]
    //[Serializable] 
    #endregion

    [Table(TableName ="Employee")]
    public class Emp
    {
        private int _Id;
        private string _Name;
        private string _Address;

        [Column(ColumnName ="EId",ColumnType = "int")]
        public int Id
        {
            get { return _Id; }
            set { _Id = value; }
        }
        [Column(ColumnName = "EName", ColumnType = "varchar(50)")]
        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }
        [Column(ColumnName = "EAddress", ColumnType = "varchar(50)")]
        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }  
    }
}
