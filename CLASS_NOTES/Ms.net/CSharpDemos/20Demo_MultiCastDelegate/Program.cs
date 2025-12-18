namespace _20Demo_MultiCastDelegate
{
    public delegate void MyEventHandler();
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Is Guest arrived?");
            string isGuestArrived = Console.ReadLine();

            CollegeAnnualEvent obj = new CollegeAnnualEvent();
            // handler is our Muti-cast Delegate
            MyEventHandler handler = obj.WelCome;
            handler += obj.WelSpeech;
            if (isGuestArrived == "y")
            {
                handler += obj.GuestSpeech;
            }
            else
            {
                // -= del-coupling operator
                handler -= obj.GuestSpeech;
            }
            handler += obj.Dance;
            handler += obj.Dinner;
            handler += obj.GoodBye;
            handler += obj.EndEvent;

            handler();

            //MyEventHandler handler1 = new MyEventHandler(obj.WelCome);
            //MyEventHandler handler2 = obj.WelSpeech;
            //MyEventHandler handler3 += obj.GuestSpeech;

        }
    }
    public class CollegeAnnualEvent
    {
        public void WelCome()
        {
            Console.WriteLine("Wel-come Everyone!!");
        }
        public void WelSpeech()
        {
            Console.WriteLine("Host: blah blah blah blah!!");
        }
        public void GuestSpeech()
        {
            Console.WriteLine("Guest: blah blah blah blah!!");
        }
        public void Dance()
        {
            Console.WriteLine("Oh GOD, we have have to go through this!!");
        }
        public void Dinner()
        {
            Console.WriteLine("We insist everyone , please enjoy dinner...!!");
        }
        public void GoodBye()
        {
            Console.WriteLine("Bye bye.. please ghar jao...!!");
        }
        public void EndEvent()
        {
            Console.WriteLine("Pack UP...!!");
        }
    }
}
