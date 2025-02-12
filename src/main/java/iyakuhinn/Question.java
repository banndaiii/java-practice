package iyakuhinn;

public enum Question {
    Q1("痛む場所はどこですか",
           new String[]{
                   "片側のこめかみ周辺、ときに両側や後頭部",
                   "後頭部から首筋にかけて",
                   "片側の目の奥から側頭部"
           }),
    Q2("痛み止めなどを飲まない場合、頭痛はどのぐらい続きますか",
           new String[]{
                   "半日以上３日未満",
                   "30分のこともあれば1年中のことも",
                   "1～3時間"
           })
    ;

private final String text;
private final String[] answers;
Question(String text, String[] answers){
    this.text = text;
    this.answers = answers;
}

public String getText(){
    return text;
}

    public String[] getAnswers() {
        return answers;
    }
}
