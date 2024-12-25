package jp.ac.uryukyu.ie.e245728;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("『魔法の薬、売ります。』");
        System.out.println("あなたの名前を教えてください。");

        Scanner scan = new Scanner(System.in);//どこに置いてもいい。ただし、scanの前に書く必要がある。
        String name = scan.next();

        System.out.println("「" + name + "」さん、このゲームへようこそ！");

        String fristseen = "プレゼントシーン";
        String seen = fristseen;

        while(true){
            if (seen == "プレゼントシーン"){
                seen = presentseen(scan);
            }

            else if (seen == "ゲーム終了シーン"){
                break;
            }
            else if (seen == "倉庫シーン"){
                seen = garageseen(scan);
            }
        }
        System.out.println("ゲームを終了します。");

        scan.close();
    }

    public static String presentseen(Scanner scan){
        System.out.println("あなたの好きな素材を教えてください。好きなだけプレゼントします。");
        System.out.println("1.スライムのジェル");
        System.out.println("2.聖水");
        System.out.println("3.もういらない！");

        int item_num = scan.nextInt();

        String nextseen = "";
        
        if (item_num == 1){
            System.out.println("あなたはスライムのジェルを受け取った。プルプルしているね！");
            nextseen = "プレゼントシーン";
        } else if (item_num == 2){
            System.out.println("あなたは聖水を受け取った。なんだか神聖な気がする…。");
            nextseen = "プレゼントシーン";
        } else if (item_num == 3){ //３の時ブレイクしてwhileから抜ける
            System.out.println("プレゼントタイムを終了しました。");
            nextseen = "倉庫シーン";
        }

        //System.out.println("---------------------------");
        return nextseen;
    }

    public static String garageseen(Scanner scan){
        System.out.println("倉庫にしまったらもっと欲しくなりますね。");

        System.out.println("1.もう一回もらいに行く。");
        System.out.println("2.やめておく。");
        int choose_num = scan.nextInt();
        String nextseen = "";
        if (choose_num == 1){
            nextseen = "プレゼントシーン";
        } 
        else if(choose_num == 2){
            nextseen = "ゲーム終了シーン";
        }

        return nextseen;
    }

}
