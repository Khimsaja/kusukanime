package j3;

import f6.AbstractC0905c;
import java.util.Map;

/* renamed from: j3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1327m implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC0905c.l(getKey(), entry.getKey()) && AbstractC0905c.l(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
