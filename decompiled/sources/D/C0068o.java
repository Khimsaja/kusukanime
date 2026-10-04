package D;

import G2.C0174k;
import e4.InterfaceC0821a;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.List;
import w.C2165f;
import x.C2233g;
import y.InterfaceC2339t;

/* renamed from: D.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068o extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1252l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O.Z f1253m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0068o(int i7, O.Z z7) {
        super(0);
        this.f1252l = i7;
        this.f1253m = z7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f1252l) {
            case 0:
                Boolean bool = (Boolean) this.f1253m.getValue();
                bool.booleanValue();
                return bool;
            case 1:
                List list = (List) this.f1253m.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (kotlin.jvm.internal.l.a(((C0174k) obj).f2703l.f2757k, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 2:
                return (K.h) this.f1253m.getValue();
            case 3:
                return new C2165f((e4.k) this.f1253m.getValue());
            case GzipHeaderFlags.EXTRA /* 4 */:
                return new C2233g((e4.k) this.f1253m.getValue());
            default:
                return (InterfaceC2339t) ((InterfaceC0821a) this.f1253m.getValue()).invoke();
        }
    }
}
