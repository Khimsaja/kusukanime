package V2;

import H1.C0221b;
import java.io.IOException;
import java.util.ArrayList;
import w6.y;

/* loaded from: classes.dex */
public final class c {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f9446b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9447c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9448d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9449e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9450f;

    /* renamed from: g, reason: collision with root package name */
    public C0221b f9451g;

    /* renamed from: h, reason: collision with root package name */
    public int f9452h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f9453i;

    public c(g gVar, String str) {
        this.f9453i = gVar;
        this.a = str;
        gVar.getClass();
        this.f9446b = new long[2];
        gVar.getClass();
        this.f9447c = new ArrayList(2);
        gVar.getClass();
        this.f9448d = new ArrayList(2);
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        gVar.getClass();
        for (int i7 = 0; i7 < 2; i7++) {
            sb.append(i7);
            this.f9447c.add(this.f9453i.f9460k.d(sb.toString()));
            sb.append(".tmp");
            this.f9448d.add(this.f9453i.f9460k.d(sb.toString()));
            sb.setLength(length);
        }
    }

    public final d a() {
        if (this.f9449e && this.f9451g == null && !this.f9450f) {
            ArrayList arrayList = this.f9447c;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                g gVar = this.f9453i;
                if (i7 >= size) {
                    this.f9452h++;
                    return new d(gVar, this);
                }
                if (gVar.f9475z.g((y) arrayList.get(i7))) {
                    i7++;
                } else {
                    try {
                        gVar.H(this);
                        return null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return null;
    }
}
