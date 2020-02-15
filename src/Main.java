import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
 //        1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3
//        попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное
//        пользователем число чем загаданное, или меньше. После победы или проигрыша выводится запрос –
//        «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        while (true){
            int level = 10;
            System.out.println("Данная программа позваляет Вам поиграть в две игры, в первой нужно будет угудать " +
                    "число от 1 до " + (level)+ " за три хода, во второй слово на английском языке.");
            System.out.println("Выберите игру (1) или (2): ");
            int numSel = scan.nextInt();
            if(numSel==1){
                System.out.println("Игра_1");
                System.out.println("Я уже загадала число.");
                int k=0;
                while (true){
                    int numGame = ran.nextInt(level)+1;
                    k = 0;
                    while(true){
                        k++;
                        System.out.print("Ваше число: ");
                        int numUser = scan.nextInt();
                        if (numGame==numUser){
                            System.out.println("Вы угадали!!! Это число " + numGame);
                            break;
                        } else if(numGame>numUser){
                            System.out.println("Ваше число меньше.");
                        } else {
                            System.out.println("Ваше число больше.");
                        }
                        if (k==3){
                            System.out.println("Вы проиграли!!! Это было число " + numGame);
                            break;
                        }
                    }
                    System.out.println("Хотите попробовать еще раз? Введите \"да\" или \"1\", если нет любой другой символ: ");
                    String repeat = scan.next();
                    if (!(repeat.equals("да")||repeat.equals("1"))){
                        break;
                    }
                }
            } else {
//        2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot",
//        "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
//        "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если
//        слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//        apple – загаданное
//        apricot - ответ игрока
//        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//        Для сравнения двух слов посимвольно, можно пользоваться:
//        String str = "apple";
//        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//        Играем до тех пор, пока игрок не отгадает слово
//        Используем только маленькие буквы
                while (true){
                    System.out.println("Игра_2");
                    String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                            "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
                            "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
                    String wordGame = words[ran.nextInt(words.length)];
                    System.out.println("Я уже загадала слово, введите ваше:");
                    System.out.println(wordGame); //test
                    String wordUser = "";
                    boolean flag = true;
                    while (flag){
                        wordUser = scan.next();
                        while (wordGame.length()>wordUser.length()){
                            wordUser = wordUser + "#";
                        }
                        if (wordGame.equals(wordUser)){
                            System.out.println("Вы угадали!!! Моё словов было - " + wordGame+".");
                            flag = false;
                        } else {
                            for(int i = 0; i<wordGame.length();i++){
                                if(wordGame.charAt(i) == wordUser.charAt(i)){
                                    System.out.print(wordGame.charAt(i));
                                } else {
                                    System.out.print("#");
                                }
                            }
                            for (int j=0; j<15-wordGame.length(); j++){
                                System.out.print("#");
                            }
                            System.out.println();
                        }
                    }
                    System.out.println("Хотите попробовать еще раз? Введите \"да\" или \"1\", если нет любой другой символ: ");
                    String repeat = scan.next();
                    if (!(repeat.equals("да")||repeat.equals("1"))){
                        break;
                    }
                }
            }

            System.out.println("Хотите выйти? Введите \"да\" или \"1\", если нет любой другой символ: ");
            String repeat = scan.next();
            if (repeat.equals("да")||repeat.equals("1")){
                break;
            }
        }

    }
}
