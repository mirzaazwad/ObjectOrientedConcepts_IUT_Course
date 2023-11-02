package Lab7.Village;

import Lab7.VillageComponent;

import java.util.ArrayList;
import java.util.List;

public class VillageConfiguration implements VillageComponent {
    private final List<VillageComponent> components = new ArrayList<>();

    public void addComponent(VillageComponent component) {
        components.add(component);
    }

    public String build() {
        String ans="Building a Village Configuration:\n";
        for (VillageComponent component : components) {
            ans+=component.build();
        }
        return ans;
    }
}