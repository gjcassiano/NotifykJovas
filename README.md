# NotifykJovas
Notificação Visual - Codigo exemplo

    package notifykjovas; // TODO: this package must start with capital letter.
    
    public class main {
      
      public static void main(String[] args) {
          
          if (args.length > 1 ) {
          
              notifykjovas notify = new notifykjovas(args[0], args[1]);
              notify.Showform();
              
          } else {
          
              notifykjovas notify= new notifykjovas("titulo", "informacao");
              notify.Showform();
          }
          
      }
    }
