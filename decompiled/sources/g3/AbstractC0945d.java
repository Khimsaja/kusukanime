package g3;

import D6.r;
import H5.M;
import M5.m;
import android.graphics.Bitmap;
import d3.C0791c;
import d3.C0797i;
import d3.EnumC0790b;
import f3.C0877c;
import f3.InterfaceC0879e;

/* renamed from: g3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0945d {
    public static final C0791c a;

    static {
        O5.e eVar = M.a;
        I5.e eVar2 = m.a.f4075o;
        O5.d dVar = O5.d.f7623l;
        C0877c c0877c = InterfaceC0879e.a;
        e3.e eVar3 = e3.e.f11350m;
        Bitmap.Config config = AbstractC0946e.a;
        EnumC0790b enumC0790b = EnumC0790b.f11237m;
        a = new C0791c(eVar2, dVar, dVar, dVar, c0877c, eVar3, config, true, false, null, null, null, enumC0790b, enumC0790b, enumC0790b);
    }

    public static final boolean a(C0797i c0797i) {
        int iOrdinal = c0797i.f11279e.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 2) {
            return c0797i.f11299y.a == null && (c0797i.f11296v instanceof e3.d);
        }
        throw new r();
    }
}
