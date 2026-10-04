package h4;

import kotlin.jvm.internal.l;
import l4.InterfaceC1443v;

/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1009a implements InterfaceC1011c {
    private Object value;

    public AbstractC1009a(Object obj) {
        this.value = obj;
    }

    public boolean beforeChange(InterfaceC1443v interfaceC1443v, Object obj, Object obj2) {
        l.f("property", interfaceC1443v);
        return true;
    }

    @Override // h4.InterfaceC1010b
    public Object getValue(Object obj, InterfaceC1443v interfaceC1443v) {
        l.f("property", interfaceC1443v);
        return this.value;
    }

    @Override // h4.InterfaceC1011c
    public void setValue(Object obj, InterfaceC1443v interfaceC1443v, Object obj2) {
        l.f("property", interfaceC1443v);
        Object obj3 = this.value;
        if (beforeChange(interfaceC1443v, obj3, obj2)) {
            this.value = obj2;
            afterChange(interfaceC1443v, obj3, obj2);
        }
    }

    public String toString() {
        return A6.b.i(new StringBuilder("ObservableProperty(value="), this.value, ')');
    }

    public void afterChange(InterfaceC1443v interfaceC1443v, Object obj, Object obj2) {
    }
}
