namespace _21Demo_ObserverPattern
{
    public delegate void NotifyEventHandler(string message);
    internal class Program
    {
        static void Main(string[] args)
        {
            Publisher publisher = new Publisher();
            Subscriber subscriber = new Subscriber();

            // coupling multiple methods to the event :: Multi-cast event
            publisher.Notify += subscriber.MethodA;
            publisher.Notify += subscriber.MethodB;

            // Raise the event
            publisher.NotifySubscribers("The Grand Sale is UP! Upto 70% off on selected products!");

            // optout MethodB from receiving notifications
            publisher.Notify -= subscriber.MethodB;
            // Raise the event again
            publisher.NotifySubscribers("Flash Sale! Extra 10% off on Electronics!");
        }
    }
    public class Subscriber
    {
        public void MethodA(string message)
        {
            Console.WriteLine($"MethodA received: {message} via SMS");
        }
        public void MethodB(string message)
        {
            Console.WriteLine($"MethodB received: {message} via EMail");
        }
    }

    public class Publisher
    {
        public event NotifyEventHandler Notify;
        //public void TriggerEvents()
        //{
        //    Notify.Invoke("Event triggered!");
        //}
        public void NotifySubscribers(string message)
        {
            Notify?.Invoke(message); // Null-conditional operator to avoid null reference exception
        }
    }
}
