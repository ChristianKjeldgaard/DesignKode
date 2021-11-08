public class Vejlederkontroller {

   public Vejleder Vejlederliste[] = new Vejleder[1];

   public void setStudentToVejleder(String StudentID, String VejlederID) {
      Brugerdatabase brugerdatabase = new Brugerdatabase();
     Studerende studerende = (Studerende) brugerdatabase.getbruger(StudentID);
     Vejleder vejleder = (Vejleder) brugerdatabase.getbruger(VejlederID);

      vejleder.setStudenterliste(studerende);
   }

}
