package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import e1.AbstractC0817a;
import io.ktor.util.GzipHeaderFlags;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f10686k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f10687b;

    /* renamed from: j, reason: collision with root package name */
    public String f10695j;
    public int a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f10688c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f10689d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f10690e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f10691f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f10692g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f10693h = f10686k;

    /* renamed from: i, reason: collision with root package name */
    public String f10694i = null;

    public final String toString() {
        String str;
        int iIntValue;
        if (this.a == -1) {
            return String.valueOf(this.f10687b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f10687b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f10687b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f10695j);
                sb.append(" id=");
                int i7 = this.a;
                if (i7 == -1) {
                    int i8 = Build.VERSION.SDK_INT;
                    Object obj = this.f10687b;
                    if (i8 >= 28) {
                        iIntValue = AbstractC0817a.b(obj);
                    } else {
                        iIntValue = 0;
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
                        } catch (IllegalAccessException e7) {
                            Log.e("IconCompat", "Unable to get icon resource", e7);
                        } catch (NoSuchMethodException e8) {
                            Log.e("IconCompat", "Unable to get icon resource", e8);
                        } catch (InvocationTargetException e9) {
                            Log.e("IconCompat", "Unable to get icon resource", e9);
                        }
                    }
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iIntValue = this.f10690e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f10690e);
                if (this.f10691f != 0) {
                    sb.append(" off=");
                    sb.append(this.f10691f);
                    break;
                }
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 6:
                sb.append(" uri=");
                sb.append(this.f10687b);
                break;
        }
        if (this.f10692g != null) {
            sb.append(" tint=");
            sb.append(this.f10692g);
        }
        if (this.f10693h != f10686k) {
            sb.append(" mode=");
            sb.append(this.f10693h);
        }
        sb.append(")");
        return sb.toString();
    }
}
