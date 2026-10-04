package T4;

import java.util.Arrays;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: g, reason: collision with root package name */
    public static final f f9107g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f9108h;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9109f;

    static {
        f fVar = new f(new int[]{2, 2, 0}, false);
        f9107g = fVar;
        int i7 = fVar.f9063c;
        int i8 = fVar.f9062b;
        f9108h = (i8 == 1 && i7 == 9) ? new f(new int[]{2, 0, 0}, false) : new f(new int[]{i8, i7 + 1, 0}, false);
        new f(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int[] iArr, boolean z7) {
        super(Arrays.copyOf(iArr, iArr.length));
        l.f("versionArray", iArr);
        this.f9109f = z7;
    }

    public final boolean b(f fVar) {
        l.f("metadataVersionFromLanguageVersion", fVar);
        f fVar2 = this.f9109f ? f9107g : f9108h;
        fVar2.getClass();
        int i7 = fVar.f9062b;
        int i8 = fVar2.f9062b;
        if (i8 > i7 || (i8 >= i7 && fVar2.f9063c > fVar.f9063c)) {
            fVar = fVar2;
        }
        boolean z7 = false;
        int i9 = this.f9063c;
        int i10 = this.f9062b;
        if ((i10 == 1 && i9 == 0) || i10 == 0) {
            return false;
        }
        int i11 = fVar.f9062b;
        if (i10 > i11 || (i10 >= i11 && i9 > fVar.f9063c)) {
            z7 = true;
        }
        return !z7;
    }
}
