namespace NotePadDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            SpellCheckerFactory factory = new SpellCheckerFactory();
            ISpellChecker somechecker = factory.GetSomeSpellChecker("sp");
            Notepad notepad=new Notepad(somechecker);
            notepad.Cut();
            notepad.SpellCheck();

            HindiSpellChecker hindiChecker = new HindiSpellChecker();
            Notepad forhindi= new  Notepad(hindiChecker);
            forhindi.Cut();
            forhindi.SpellCheck();

            KlingonSpellChecker klingonSpellChecker=new KlingonSpellChecker();
            Notepad klingonLang = new Notepad(klingonSpellChecker);
            klingonLang.Cut();
            klingonLang.SpellCheck();
        }
    }
    public class Notepad
    {
        private ISpellChecker _checker;
        public Notepad(ISpellChecker checker)
        {
            SpellCheckerFactory factory=new SpellCheckerFactory();
            if(checker==null)
            {
                _checker =factory.GetSomeSpellChecker("en");
            }
            else
            {
                _checker = checker;
            }
        }

        public void Cut()
        {
            Console.WriteLine("Text cut functionality done");
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

        public ISpellChecker GetSomeSpellChecker(string lang)
        {
            switch(lang)
            {
                case "en":
                    _someChecker = new EnglishSpellChecker();
                    break;
                case "gr":
                    _someChecker=new GermanSpellChecker();
                    break;
                case "sp":
                    _someChecker= new SpanishSpellChecker();
                    break;
                default:
                    _someChecker = new EnglishSpellChecker();
                    break;
            }
            return _someChecker;
        }
    }
    public class EnglishSpellChecker : ISpellChecker
    {
        public void DoSpellCheck()
        {
            Console.WriteLine("Spell check done for English text");
        }   

    }
    public class HindiSpellChecker : ISpellChecker
    {
        public void DoSpellCheck()
        {
            
            Console.WriteLine("Spell check done for Hindi Text");
        }
    }
    public class GermanSpellChecker : ISpellChecker 
    { 
        public void DoSpellCheck()
        {
            Console.WriteLine("Spell check done for German text");
        }
    }

    public class SpanishSpellChecker : ISpellChecker { 
        public void DoSpellCheck()
        {
            Console.WriteLine(" Spell check done for Spanish text");
        }
    }

    public class KlingonSpellChecker : ISpellChecker
    {
        public void DoSpellCheck()
        {
            Console.WriteLine("spell check done for KLingon text");
        }
        

    }
}
