package factorization.common;

import factorization.common.Core.TabType;


public class ItemCraftingComponent extends ItemFactorization {
    public ItemCraftingComponent(int id, String name) {
        super(id, name, TabType.MATERIALS);
    }
    
    public ItemCraftingComponent(int id, String name, TabType type) {
        super(id, name, type);
    }
}
