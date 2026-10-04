package S4;

import java.util.Arrays;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a extends T4.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f8770f = new a(1, 0, 7);

    static {
        new a(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        l.f("numbers", iArr);
    }
}
