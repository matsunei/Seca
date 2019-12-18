class Challenge
{
    private String question;
    private int ans;
    public Challenge()
    {
        question = null;
        ans = 0;
    }
    public Challenge(String question, int ans)
    {
        this.question = question;
        this.ans=ans;
    }
    public String getQuestion()
    {
        return question;
    }
    public int getAns()
    {
        return ans;
    }
    
   
}// end Challenge class
