package github.saukiya.sxattribute.event;

import github.saukiya.sxattribute.data.attribute.SXAttributeData;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

/**
 * 这个类用来加载玩家防具物品的数据事件
 * 可以对里面的Items、AttributeData进行修改操作
 *
 * @author Saukiya
 * @since 2018年5月2日
 */

public class UpdateStatsEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    @Getter
    private final StatsUpdateType type;
    @Getter
    private final LivingEntity entity;
    @Setter
    @Getter
    private SXAttributeData attributeData;
    @Setter
    @Getter
    private ItemStack[] items;

    public UpdateStatsEvent(StatsUpdateType type, LivingEntity entity, SXAttributeData attributeData, ItemStack... items) {
        this.type = type;
        this.entity = entity;
        this.attributeData = attributeData;
        this.items = items;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

}
