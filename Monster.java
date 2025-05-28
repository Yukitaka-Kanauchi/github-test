public class Monster {
    //メンバ変数
    private String monsterName;//モンスター名
    private int currentMonsterLevel;//モンスターの現在のレベル
    private int maxMonsterLevel;//モンスターの最高レベル

    //1.継承
    //2.多態性(ポリモーフィズム)
    //3.カプセル化
    
    //コンストラクタ
    public Monster(String _monsterName, int _currentMonsterLevel, int _maxMonsterLevel){
        //初期化
        monsterName = _monsterName;
        currentMonsterLevel = _currentMonsterLevel;
        maxMonsterLevel = _maxMonsterLevel;
    }
    

    //モンスター名を取得
    //戻り値-モンスター名
    public String GetMonsterName(){
        return this.monsterName;
    }

    //モンスターの現在レベルを取得
    //戻り値-モンスターのレベル
    public int GetCurrentMonsterLevel(){
        return this.currentMonsterLevel;
    }

    //モンスターの最高レベル
    //戻り値-モンスターの最高レベル
    public int GetMaxMonsterLevel(){
        return this.maxMonsterLevel;
    }

    //モンスター名を設定
    //引数-設定したいモンスター名
    //戻り値-なし
    public void SetMonsterName(String _monsterName){
        this.monsterName = _monsterName;
    }

    //モンスターの現在のレベルを設定
    //引数-設定したいモンスターの現在のレベル
    //戻り値-なし
    public void SetCurrentMonsterLevel(int _currentMonsterLevel){
        this.currentMonsterLevel = _currentMonsterLevel;
    }

    //モンスターの最高レベルを設定
    //引数-設定したいモンスターの最高レベル
    //戻り値-なし
    public void SetMaxMonsterLevel(int _maxMonsterLevel){
        this.maxMonsterLevel = _maxMonsterLevel;
    }

    //ポケモンの進化過程の処理
    //引数-(モンスター名、現在のモンスターのレベル、モンスターの最高レベル)
    //戻り値-なし
    public void PokemonEvolution(String _monsterName , int _currentMonsterLevel, int _maxMonsterLevel){
        
        for(int i = _currentMonsterLevel; i <= _maxMonsterLevel; i++){
            System.out.println("【" + _monsterName + "はレベル" + i +"になった】");
            //モンスターのレベルアップ
            LevelUp(_monsterName, i);
        }
        
    }


    //モンスターのレベルアップを行う
    private void LevelUp(String _monsterName, int _currentMonsterLevel){
        String tmpName = "";
        if(_currentMonsterLevel % 5 == 0 && _currentMonsterLevel != 35){
            LearnWaza(_monsterName);

        }else if(_currentMonsterLevel == 17 || _currentMonsterLevel == 35){
            LearnWaza(_monsterName);
            FellEvolution(_monsterName, tmpName);

        }else if(_currentMonsterLevel == 18){
            tmpName = _monsterName;
            _monsterName = "リザード";
            Evolved(_monsterName, tmpName);

             //進化後のモンスター名をセット
            SetMonsterName((_monsterName));

        }else if(_currentMonsterLevel == 35){
            FellEvolution(_monsterName, tmpName);

        }else if(_currentMonsterLevel == 36){
            tmpName = _monsterName;
            _monsterName = "リザードン";
            Evolved(_monsterName, tmpName);

            //進化後のモンスター名をセット
            SetMonsterName((_monsterName)); 
        }
    }

    //技を覚えた時の表示
    private void LearnWaza(String _monsterName){
         System.out.println("※" + _monsterName + "はわざを覚えた！");
    }

    //進化の気配を感じた時の表示
    private void FellEvolution(String _monsterName, String _tmpName){
        System.out.println("※" + _monsterName + "は進化の気配を感じている！");
    }

    //進化した時の表示
    private void Evolved(String _monsterName, String _tmpName){
         System.out.println("※" + _tmpName + "は" + _monsterName + "に進化した！");
    }
}
