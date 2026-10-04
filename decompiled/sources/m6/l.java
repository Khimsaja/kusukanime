package m6;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends i6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13032e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f13033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13034g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, n nVar, int i7, List list) {
        super(str, true);
        this.f13033f = nVar;
        this.f13034g = i7;
    }

    @Override // i6.a
    public final long a() {
        switch (this.f13032e) {
            case 0:
                this.f13033f.f13056u.getClass();
                try {
                    this.f13033f.f13044G.s(this.f13034g, 9);
                    synchronized (this.f13033f) {
                        this.f13033f.I.remove(Integer.valueOf(this.f13034g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f13033f.f13056u.getClass();
                try {
                    this.f13033f.f13044G.s(this.f13034g, 9);
                    synchronized (this.f13033f) {
                        this.f13033f.I.remove(Integer.valueOf(this.f13034g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, n nVar, int i7, List list, boolean z7) {
        super(str, true);
        this.f13033f = nVar;
        this.f13034g = i7;
    }
}
