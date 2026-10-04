package b6;

import f0.C0849b;
import kotlinx.serialization.descriptors.SerialDescriptor;
import n5.AbstractC1586x;
import o5.C1710j;
import o5.C1712l;
import o5.InterfaceC1711k;
import z0.C2471u;

/* loaded from: classes.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11030k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i7, Object obj, Class cls, String str, String str2, int i8, int i9) {
        super(i7, i8, cls, obj, str, str2);
        this.f11030k = i9;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11030k) {
            case 0:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                int iIntValue = ((Number) obj2).intValue();
                kotlin.jvm.internal.l.f("p0", serialDescriptor);
                s sVar = (s) this.receiver;
                sVar.getClass();
                boolean z7 = !serialDescriptor.k(iIntValue) && serialDescriptor.j(iIntValue).h();
                sVar.f11031b = z7;
                return Boolean.valueOf(z7);
            case 1:
                AbstractC1586x abstractC1586x = (AbstractC1586x) obj;
                AbstractC1586x abstractC1586x2 = (AbstractC1586x) obj2;
                kotlin.jvm.internal.l.f("p0", abstractC1586x);
                kotlin.jvm.internal.l.f("p1", abstractC1586x2);
                ((o5.t) this.receiver).getClass();
                InterfaceC1711k.f13810b.getClass();
                C1712l c1712l = C1710j.f13809b;
                return Boolean.valueOf(c1712l.b(abstractC1586x, abstractC1586x2) && !c1712l.b(abstractC1586x2, abstractC1586x));
            case 2:
                AbstractC1586x abstractC1586x3 = (AbstractC1586x) obj;
                AbstractC1586x abstractC1586x4 = (AbstractC1586x) obj2;
                kotlin.jvm.internal.l.f("p0", abstractC1586x3);
                kotlin.jvm.internal.l.f("p1", abstractC1586x4);
                return Boolean.valueOf(((C1712l) this.receiver).a(abstractC1586x3, abstractC1586x4));
            default:
                return Boolean.valueOf(C2471u.e((C2471u) this.receiver, (C0849b) obj, (g0.d) obj2));
        }
    }
}
