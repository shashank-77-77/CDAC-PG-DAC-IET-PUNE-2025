using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _17Demo_WinForm
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            Button btn = new Button();
            btn.Text = "Click ME";
            // someObject.EventName (+= Coupling Operator) Event Handlers(targeted method based on a particular type/ Signature)
            btn.Click += new EventHandler(btn_Click);

            // Type -safe function pointer

            this.Controls.Add(btn);
        }

        private void btn_Click(object sender, EventArgs e)
        {
            MessageBox.Show("You clicked a button!");
        }

        private void label1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("You clicked a label!");
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'testDataSet.Emp' table. You can move, or remove it, as needed.
            this.empTableAdapter.Fill(this.testDataSet.Emp);

        }
    }
}
