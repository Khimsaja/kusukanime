package D;

import O.C0510p;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: D.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066n extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1228l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0066n(int i7) {
        super(2);
        this.f1228l = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
        int i7;
        C0510p c0510p = (C0510p) obj;
        ((Number) obj2).intValue();
        c0510p.R(-1451087197);
        int i8 = this.f1228l;
        if (i8 == 0) {
            throw null;
        }
        c0510p.k(AndroidCompositionLocals_androidKt.a);
        Resources resources = ((Context) c0510p.k(AndroidCompositionLocals_androidKt.f10669b)).getResources();
        if (i8 == 1) {
            i7 = R.string.cut;
        } else if (i8 == 2) {
            i7 = R.string.copy;
        } else if (i8 == 3) {
            i7 = R.string.paste;
        } else {
            if (i8 != 4) {
                throw null;
            }
            i7 = R.string.selectAll;
        }
        String string = resources.getString(i7);
        c0510p.p(false);
        return string;
    }
}
