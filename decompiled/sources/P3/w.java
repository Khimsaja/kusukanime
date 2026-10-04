package P3;

import e4.InterfaceC0821a;
import io.ktor.http.Url;
import java.util.List;
import l4.InterfaceC1444w;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7776k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f7777l;

    public /* synthetic */ w(int i7, List list) {
        this.f7776k = i7;
        this.f7777l = list;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f7776k) {
            case 0:
                return this.f7777l.iterator();
            case 1:
                return ((InterfaceC1444w) this.f7777l.get(0)).c();
            case 2:
                return ((InterfaceC1444w) this.f7777l.get(0)).c();
            case 3:
                return Url.segments_delegate$lambda$1(this.f7777l);
            default:
                return Integer.valueOf(this.f7777l.size());
        }
    }
}
