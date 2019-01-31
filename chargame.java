
import java.util.*;
class chargame
{
    Scanner ob=new Scanner (System.in);
    void main()

    {
        while (true)
        {
            System.out.println("enter stop value");
            
            int end=ob.nextInt();
             System.out.println("enter start value");
             int BEG=ob.nextInt();
            for(int i=BEG;i<=end;i++)
            {
                char a=(char)i;
                System.out.print(a+" , ");
            }
            System.out.println();
        }
    }
} /**ɐ , ɑ , ɒ , ɓ , ɔ , ɕ , ɖ , ɗ , ɘ , ə , ɚ , ɛ , ɜ , ɝ , ɞ , ɟ , ɠ , ɡ , ɢ , ɣ , ɤ , ɥ , ɦ , ɧ , ɨ , ɩ , ɪ , ɫ , ɬ , ɭ , ɮ , ɯ , ɰ , ɱ , ɲ , ɳ , ɴ , ɵ , ɶ , ɷ , ɸ , ɹ , ɺ , ɻ , ɼ , ɽ , ɾ , ɿ , ʀ , ʁ , ʂ , ʃ , ʄ , ʅ , ʆ , ʇ , ʈ , ʉ , ʊ , ʋ , ʌ , ʍ , ʎ , ʏ , ʐ , ʑ , ʒ , ʓ , ʔ , ʕ , ʖ , ʗ , ʘ , ʙ , ʚ , ʛ , ʜ , ʝ , ʞ , ʟ , ʠ , ʡ , ʢ , ʣ , ʤ , ʥ , ʦ , ʧ , ʨ , ʩ , ʪ , ʫ , ʬ , ʭ , ʮ , ʯ , ʰ , ʱ , ʲ , ʳ , ʴ , ʵ , ʶ , ʷ , ʸ , ʹ , ʺ , ʻ , ʼ , ʽ , ʾ , ʿ , ˀ , ˁ , ˂ , ˃ , ˄ , ˅ , ˆ , ˇ , ˈ , ˉ , ˊ , ˋ , ˌ , ˍ , ˎ , ˏ , ː , ˑ , ˒ , ˓ , ˔ , ˕ , ˖ , ˗ , ˘ , ˙ , ˚ , 
enter stop value**/
