
public class test{
    public static void main(String[] args){
        //Monsterクラスのインスタンスを生成
        Monster monster = new Monster("ヒトカゲ", 1, 40);

        // 成長前の名前を表示
        System.out.println("成長前のモンスターは" + monster.GetMonsterName() + "です！");
        //ポケモンの成長過程
        monster.PokemonEvolution(monster.GetMonsterName(),monster.GetCurrentMonsterLevel(),monster.GetMaxMonsterLevel());

        //成長後の名前を表示
        System.out.println("成長後のモンスターは" + monster.GetMonsterName() + "です！");

        

    }
}