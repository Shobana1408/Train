import java.util.ArrayList;
import java.util.List;
class UseCase12TrainConsistMgmt {
    static class GoodsBogie {
        String type;
        String cargo;
        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }
    public static void main(String[] args) {
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));
        if (isSafe) {
            System.out.println("Train is safety compliant.");
        } else {
            System.out.println("Train is not safety compliant.");
        }
    }
}
