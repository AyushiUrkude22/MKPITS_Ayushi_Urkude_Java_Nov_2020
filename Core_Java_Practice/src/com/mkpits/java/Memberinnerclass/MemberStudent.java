package src.com.mkpits.java.Memberinnerclass;
//Java Member inner class example.

class MemberStudent
    {
        private int rno=22;
        class address
        {
            public void showdata()
            {
                System.out.println("rno " + rno);
            }
        }
    }

    class testinner
    {
        public static void main(String[] arg)
        {
            MemberStudent s=new MemberStudent();
            MemberStudent.address sa=s.new address();
            sa.showdata();
        }
    }
