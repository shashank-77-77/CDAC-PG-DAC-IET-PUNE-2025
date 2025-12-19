namespace MultiCastDelegate
{
    public delegate void MyEventHandler();
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Is Guest arrived");
            string isGuestArrived = Console.ReadLine();

            CollegeAnnualEvent obj = new CollegeAnnualEvent();
            MyEventHandler handler = obj.WelCome;
            handler += obj.WelSpeech;
            if (isGuestArrived == "y")
            {
                handler += obj.GuestSpeech;
            }
            else
            {
                handler -= obj.GuestSpeech;
            }
            handler += obj.Dance;
            handler += obj.Dinner;
            handler += obj.GoodBye;
            handler += obj.EndEvent;

            handler();
        }
    }

    public class CollegeAnnualEvent
    {
        public void WelCome()
        {
            Console.WriteLine("Welcome Everyone!!");
        }
        public void WelSpeech()
        {
            Console.WriteLine("Host:good morning everyone!!");
        }
        public void GuestSpeech()
        {
            Console.WriteLine("Guest: hello to one & all !!");
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
