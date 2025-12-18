namespace _13Demo_Notepad
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Notepad notepad = new Notepad(null);
            //Notepad notepad = new Notepad("gr");
            //Notepad notepad = new Notepad("en");
            //Notepad notepad = new Notepad("sp");
            //notepad.Cut();
            //notepad.SpellCheck();

            //---------------------
            SpellCheckerFactory factory = new SpellCheckerFactory();
            ISpellChecker somechecker = factory.GetSomeSpellChcker("sp");
            Notepad notepad = new Notepad(somechecker);
            notepad.Cut();
            notepad.SpellCheck();

            HindiSpellChecker hindiChecker = new HindiSpellChecker();
            Notepad forhindi = new Notepad(hindiChecker);
            forhindi.Cut();
            forhindi.SpellCheck();

            KlingonSpellChecker klingonSpellChecker = new KlingonSpellChecker();
            Notepad klingonLang= new Notepad(klingonSpellChecker);
            klingonLang.SpellCheck();
        }
    }
    public class Notepad
    {
        private ISpellChecker _checker;
        // Notepad has dependency based on some Interface/ Abstract class in constructors. : Constructor level Dependency Injection Design Pattern
        public Notepad(ISpellChecker checker)
        {
            SpellCheckerFactory factory = new SpellCheckerFactory();
            if (checker== null)
            {
                _checker = factory.GetSomeSpellChcker("en");
            }
            else
            {
                _checker = checker;
            }
        }
        //public Notepad(string lang)
        //{
        //    SpellCheckerFactory factory = new SpellCheckerFactory();
        //    if (lang == null)
        //    {
        //        _checker = factory.GetSomeSpellChcker("en");
        //    }
        //    else 
        //    {
        //        _checker = factory.GetSomeSpellChcker(lang);
        //    }
        //}
        public void Cut()
        {
            Console.WriteLine("Text Cut functionality done");
        }
        public void Copy()
        {
            Console.WriteLine("Text Copy functionality done");
        }
        public void Paste()
        {
            Console.WriteLine("Text Paste functionality done");
        }

        public void SpellCheck()
        {
            _checker.DoSpellCheck();
        }

    }
    public interface ISpellChecker
    {
        void DoSpellCheck();
    }
    public class SpellCheckerFactory
    {
        ISpellChecker _someChecker = null;
        public ISpellChecker GetSomeSpellChcker(string lang)
        {
            switch (lang)
            {
                case "en":
                    _someChecker = new EnglishSpellChecker();
                    break;
                case "gr":
                    _someChecker = new GermanSpellChecker();
                    break;
                case "sp":
                    _someChecker = new SpanishSpellChecker();
                    break;
                default:
                    _someChecker = new EnglishSpellChecker();
                    break;
            }
            return _someChecker;
        }
    }
    public class EnglishSpellChecker:ISpellChecker
    {
        public void DoSpellCheck()
        {
            // Large functionality-- lots of code
            // Min-project
            Console.WriteLine("Speck Check done for English Text");
        }
    }
    public class GermanSpellChecker:ISpellChecker
    {
        public void DoSpellCheck()
        {
            // Large functionality-- lots of code
            // Min-project
            Console.WriteLine("Speck Check done for German Text");
        }
    }
    public class SpanishSpellChecker : ISpellChecker
    {
        public void DoSpellCheck()
        {
            // Large functionality-- lots of code
            // Min-project
            Console.WriteLine("Speck Check done for Spanish Text");
        }
    }
    public class HindiSpellChecker : ISpellChecker
    {
        public void DoSpellCheck()
        {
            // Large functionality-- lots of code
            // Min-project
            Console.WriteLine("Speck Check done for Hindi Text");
        }
    }
    public class KlingonSpellChecker : ISpellChecker
    {
        public void DoSpellCheck()
        {
            // Large functionality-- lots of code
            // Min-project
            Console.WriteLine("Speck Check done for Klingon Text");
        }
    }
}
