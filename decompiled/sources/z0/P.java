package z0;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e4.InterfaceC0821a;
import f1.AbstractC0871d;
import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final class P extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18672l;

    /* renamed from: m, reason: collision with root package name */
    public static final P f18658m = new P(0, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final P f18659n = new P(0, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final P f18660o = new P(0, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final P f18661p = new P(0, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final P f18662q = new P(0, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final P f18663r = new P(0, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final P f18664s = new P(0, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final P f18665t = new P(0, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final P f18666u = new P(0, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final P f18667v = new P(0, 9);

    /* renamed from: w, reason: collision with root package name */
    public static final P f18668w = new P(0, 10);

    /* renamed from: x, reason: collision with root package name */
    public static final P f18669x = new P(0, 11);

    /* renamed from: y, reason: collision with root package name */
    public static final P f18670y = new P(0, 12);

    /* renamed from: z, reason: collision with root package name */
    public static final P f18671z = new P(0, 13);

    /* renamed from: A, reason: collision with root package name */
    public static final P f18645A = new P(0, 14);

    /* renamed from: B, reason: collision with root package name */
    public static final P f18646B = new P(0, 15);

    /* renamed from: C, reason: collision with root package name */
    public static final P f18647C = new P(0, 16);

    /* renamed from: D, reason: collision with root package name */
    public static final P f18648D = new P(0, 17);

    /* renamed from: E, reason: collision with root package name */
    public static final P f18649E = new P(0, 18);

    /* renamed from: F, reason: collision with root package name */
    public static final P f18650F = new P(0, 19);

    /* renamed from: G, reason: collision with root package name */
    public static final P f18651G = new P(0, 20);

    /* renamed from: H, reason: collision with root package name */
    public static final P f18652H = new P(0, 21);
    public static final P I = new P(0, 22);
    public static final P J = new P(0, 23);

    /* renamed from: K, reason: collision with root package name */
    public static final P f18653K = new P(0, 24);

    /* renamed from: L, reason: collision with root package name */
    public static final P f18654L = new P(0, 25);

    /* renamed from: M, reason: collision with root package name */
    public static final P f18655M = new P(0, 26);

    /* renamed from: N, reason: collision with root package name */
    public static final P f18656N = new P(0, 27);

    /* renamed from: O, reason: collision with root package name */
    public static final P f18657O = new P(0, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(int i7, int i8) {
        super(i7);
        this.f18672l = i8;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        Choreographer choreographer;
        switch (this.f18672l) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case GzipHeaderFlags.EXTRA /* 4 */:
                AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    O5.e eVar = H5.M.a;
                    choreographer = (Choreographer) H5.D.B(M5.m.a, new Y(2, null));
                }
                C2433a0 c2433a0 = new C2433a0(choreographer, AbstractC0871d.M(Looper.getMainLooper()));
                return c2433a0.plus(c2433a0.f18733u);
            case 7:
            case 8:
                return null;
            case 9:
                AbstractC2455l0.b("LocalAutofillTree");
                throw null;
            case 10:
                AbstractC2455l0.b("LocalClipboardManager");
                throw null;
            case 11:
                AbstractC2455l0.b("LocalDensity");
                throw null;
            case 12:
                AbstractC2455l0.b("LocalFocusManager");
                throw null;
            case 13:
                AbstractC2455l0.b("LocalFontFamilyResolver");
                throw null;
            case 14:
                AbstractC2455l0.b("LocalFontLoader");
                throw null;
            case 15:
                AbstractC2455l0.b("LocalGraphicsContext");
                throw null;
            case 16:
                AbstractC2455l0.b("LocalHapticFeedback");
                throw null;
            case 17:
                AbstractC2455l0.b("LocalInputManager");
                throw null;
            case 18:
                AbstractC2455l0.b("LocalLayoutDirection");
                throw null;
            case 19:
                return null;
            case 20:
                return Boolean.FALSE;
            case 21:
            case 22:
                return null;
            case 23:
                AbstractC2455l0.b("LocalTextToolbar");
                throw null;
            case 24:
                AbstractC2455l0.b("LocalUriHandler");
                throw null;
            case 25:
                AbstractC2455l0.b("LocalViewConfiguration");
                throw null;
            case 26:
                AbstractC2455l0.b("LocalWindowInfo");
                throw null;
            case 27:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
