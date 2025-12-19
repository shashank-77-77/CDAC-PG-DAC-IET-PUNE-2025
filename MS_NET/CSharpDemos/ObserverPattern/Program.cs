namespace ObserverPattern
{
    public delegate void NotifyEventHandler(string message);
    internal class Program
    {
        static void Main(string[] args)
        {

            Publisher publisher = new Publisher();
            Subscriber subscriber = new Subscriber();

            publisher.Notify += subscriber.MethodA;
            publisher.Notify += subscriber.MethodB;

            publisher.NotifySubscribers("Sale upto 50% off");

            publisher.Notify -= subscriber.MethodB;

            publisher.NotifySubscribers("Extra 10 % off product !");

        }
    }
    public class Subscriber
    {
        public void MethodA(string message)
        {
            Console.WriteLine($"MethodA received: {message} vai SMS");
        }
        public void MethodB(string message) 
        {
            Console.WriteLine($"MethodB received : {message} vai Whatsapp");
        }
    }
    public class Publisher
    {
        public event NotifyEventHandler Notify;

        public void NotifySubscribers(string message) 
        {
            Notify?.Invoke(message);
        }
    }
}
