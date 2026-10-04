package M0;

import B1.AbstractC0015b;
import B1.I;
import B1.K;
import D6.RunnableC0121o;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import c1.AbstractC0751e;
import com.kusukanime.R;
import f.AbstractC0847h;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import y1.C2393o;

/* renamed from: M0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0468a implements M1.l, p1.f {

    /* renamed from: k, reason: collision with root package name */
    public final Context f6384k;

    public C0468a(Context context, int i7) {
        switch (i7) {
            case 1:
                this.f6384k = context;
                break;
            case 2:
                this.f6384k = context.getApplicationContext();
                break;
            default:
                this.f6384k = context.getApplicationContext();
                break;
        }
    }

    @Override // M1.l
    public M1.m V0(B0.b bVar) {
        Context context;
        int i7 = K.a;
        if (i7 < 23 || (i7 < 31 && ((context = this.f6384k) == null || i7 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new A.e(21).V0(bVar);
        }
        int iH = y1.D.h(((C2393o) bVar.f277m).f18112n);
        AbstractC0015b.q("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + K.x(iH));
        return new L2.e(3, new M1.c(iH, 0), new M1.c(iH, 1)).V0(bVar);
    }

    @Override // p1.f
    public void a(AbstractC0847h abstractC0847h) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new I("EmojiCompatInitializer", 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0121o(this, abstractC0847h, threadPoolExecutor, 5));
    }

    public Typeface b(z zVar) {
        if (!(zVar instanceof z)) {
            return null;
        }
        zVar.getClass();
        zVar.getClass();
        int i7 = AbstractC0751e.a;
        Context context = this.f6384k;
        Typeface typefaceA = context.isRestricted() ? null : AbstractC0751e.a(context, R.font.inter, new TypedValue(), null);
        kotlin.jvm.internal.l.c(typefaceA);
        t tVar = zVar.f6420b;
        if (Build.VERSION.SDK_INT >= 26) {
            ThreadLocal threadLocal = C.a;
            if (typefaceA == null) {
                return null;
            }
            ArrayList arrayList = tVar.a;
            if (!arrayList.isEmpty()) {
                ThreadLocal threadLocal2 = C.a;
                Paint paint = (Paint) threadLocal2.get();
                if (paint == null) {
                    paint = new Paint();
                    threadLocal2.set(paint);
                }
                paint.setTypeface(typefaceA);
                paint.setFontVariationSettings(android.support.v4.media.session.b.n(arrayList, null, new B(0, n6.m.a(context)), 31));
                return paint.getTypeface();
            }
        }
        return typefaceA;
    }
}
