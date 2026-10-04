package R1;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: g, reason: collision with root package name */
    public static final B2.e f8080g = new B2.e(14);

    /* renamed from: h, reason: collision with root package name */
    public static final B2.e f8081h = new B2.e(15);

    /* renamed from: d, reason: collision with root package name */
    public int f8084d;

    /* renamed from: e, reason: collision with root package name */
    public int f8085e;

    /* renamed from: f, reason: collision with root package name */
    public int f8086f;

    /* renamed from: b, reason: collision with root package name */
    public final n[] f8082b = new n[5];
    public final ArrayList a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f8083c = -1;

    public final void a(float f5, int i7) {
        n nVar;
        int i8 = this.f8083c;
        ArrayList arrayList = this.a;
        if (i8 != 1) {
            Collections.sort(arrayList, f8080g);
            this.f8083c = 1;
        }
        int i9 = this.f8086f;
        n[] nVarArr = this.f8082b;
        if (i9 > 0) {
            int i10 = i9 - 1;
            this.f8086f = i10;
            nVar = nVarArr[i10];
        } else {
            nVar = new n();
        }
        int i11 = this.f8084d;
        this.f8084d = i11 + 1;
        nVar.a = i11;
        nVar.f8078b = i7;
        nVar.f8079c = f5;
        arrayList.add(nVar);
        this.f8085e += i7;
        while (true) {
            int i12 = this.f8085e;
            if (i12 <= 2000) {
                return;
            }
            int i13 = i12 - 2000;
            n nVar2 = (n) arrayList.get(0);
            int i14 = nVar2.f8078b;
            if (i14 <= i13) {
                this.f8085e -= i14;
                arrayList.remove(0);
                int i15 = this.f8086f;
                if (i15 < 5) {
                    this.f8086f = i15 + 1;
                    nVarArr[i15] = nVar2;
                }
            } else {
                nVar2.f8078b = i14 - i13;
                this.f8085e -= i13;
            }
        }
    }

    public final float b() {
        int i7 = this.f8083c;
        ArrayList arrayList = this.a;
        if (i7 != 0) {
            Collections.sort(arrayList, f8081h);
            this.f8083c = 0;
        }
        float f5 = 0.5f * this.f8085e;
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            n nVar = (n) arrayList.get(i9);
            i8 += nVar.f8078b;
            if (i8 >= f5) {
                return nVar.f8079c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((n) arrayList.get(arrayList.size() - 1)).f8079c;
    }
}
