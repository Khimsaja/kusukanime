package h0;

import android.graphics.BlendModeColorFilter;
import io.ktor.util.GzipHeaderFlags;

/* renamed from: h0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0991n {
    public static final C0991n a = new C0991n();

    public final BlendModeColorFilter a(long j7, int i7) {
        AbstractC0979b.k();
        return AbstractC0979b.e(AbstractC0968M.w(j7), AbstractC0968M.s(i7));
    }

    public final C0990m b(BlendModeColorFilter blendModeColorFilter) {
        int i7;
        long jC = AbstractC0968M.c(blendModeColorFilter.getColor());
        switch (AbstractC0980c.a[blendModeColorFilter.getMode().ordinal()]) {
            case 1:
                i7 = 0;
                break;
            case 2:
                i7 = 1;
                break;
            case 3:
                i7 = 2;
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            default:
                i7 = 3;
                break;
            case 5:
                i7 = 4;
                break;
            case 6:
                i7 = 5;
                break;
            case 7:
                i7 = 6;
                break;
            case 8:
                i7 = 7;
                break;
            case 9:
                i7 = 8;
                break;
            case 10:
                i7 = 9;
                break;
            case 11:
                i7 = 10;
                break;
            case 12:
                i7 = 11;
                break;
            case 13:
                i7 = 12;
                break;
            case 14:
                i7 = 13;
                break;
            case 15:
                i7 = 14;
                break;
            case 16:
                i7 = 15;
                break;
            case 17:
                i7 = 16;
                break;
            case 18:
                i7 = 17;
                break;
            case 19:
                i7 = 18;
                break;
            case 20:
                i7 = 19;
                break;
            case 21:
                i7 = 20;
                break;
            case 22:
                i7 = 21;
                break;
            case 23:
                i7 = 22;
                break;
            case 24:
                i7 = 23;
                break;
            case 25:
                i7 = 24;
                break;
            case 26:
                i7 = 25;
                break;
            case 27:
                i7 = 26;
                break;
            case 28:
                i7 = 27;
                break;
            case 29:
                i7 = 28;
                break;
        }
        return new C0990m(jC, i7, blendModeColorFilter);
    }
}
