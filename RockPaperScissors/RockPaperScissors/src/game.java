public class game {
    public void run() {
        setup();
    }

    public void setup() {
        element scissor = new element("scissor");
        element rock = new element("rock");
        element paper = new element("paper");
        scissor.addAttribute("rock", false);
        scissor.addAttribute("paper", true);
        scissor.addAttribute("scissor", false);
        rock.addAttribute("rock", false);
        rock.addAttribute("paper", false);
        rock.addAttribute("scissor", true);
        paper.addAttribute("rock", true);
        paper.addAttribute("paper", false);
        paper.addAttribute("scissor", false);
    }
}
