class BoolOpr{
    public static void main(String[] args) {

        boolean isalive = true;
        boolean isdead = false;

        boolean andResult = isalive && isdead;
        System.out.println("Logical AND (isalive && isdead): " + andResult);

        boolean orResult = isalive || isdead;
        System.out.println("Logical OR (isalive || isdead): " + orResult);

        boolean notResult = !isalive;
        System.out.println("Logical NOT (!isalive): " + notResult);
    }
}