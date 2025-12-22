namespace _34Demo_CustomAttributes
{
	[AttributeUsage(AttributeTargets.Class)]
    public class TableAttribute : Attribute
    {
		private string _TableName;

		public string TableName
		{
			get { return _TableName; }
			set { _TableName = value; }
		}
	}
    [AttributeUsage(AttributeTargets.Property)]
    public class ColumnAttribute : Attribute
    {
		private string _ColumnName;
		private string _ColumnType;

		public string ColumnType
		{
			get { return _ColumnType; }
			set { _ColumnType = value; }
		}


		public string ColumnName
		{
			get { return _ColumnName; }
			set { _ColumnName = value; }
		}

	}
}
