package t2;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2036b {
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15890b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f15891c;

    /* renamed from: d, reason: collision with root package name */
    public int f15892d;

    /* renamed from: e, reason: collision with root package name */
    public int f15893e;

    /* renamed from: f, reason: collision with root package name */
    public int f15894f;

    /* renamed from: g, reason: collision with root package name */
    public int f15895g;

    /* renamed from: h, reason: collision with root package name */
    public int f15896h;

    public C2036b(int i7, int i8) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f15890b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f15891c = sb;
        this.f15895g = i7;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f15892d = 15;
        this.f15893e = 0;
        this.f15894f = 0;
        this.f15896h = i8;
    }

    public final void a(char c2) {
        StringBuilder sb = this.f15891c;
        if (sb.length() < 32) {
            sb.append(c2);
        }
    }

    public final void b() {
        StringBuilder sb = this.f15891c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C2035a c2035a = (C2035a) arrayList.get(size);
                int i7 = c2035a.f15889c;
                if (i7 != length) {
                    return;
                }
                c2035a.f15889c = i7 - 1;
            }
        }
    }

    public final A1.b c(int i7) {
        float f5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f15890b;
            if (i8 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i8));
            spannableStringBuilder.append('\n');
            i8++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i9 = this.f15893e + this.f15894f;
        int length = (32 - i9) - spannableStringBuilder.length();
        int i10 = i9 - length;
        int i11 = i7 != Integer.MIN_VALUE ? i7 : (this.f15895g != 2 || (Math.abs(i10) >= 3 && length >= 0)) ? (this.f15895g != 2 || i10 <= 0) ? 0 : 2 : 1;
        if (i11 != 1) {
            if (i11 == 2) {
                i9 = 32 - length;
            }
            f5 = ((i9 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f5 = 0.5f;
        }
        float f7 = f5;
        int i12 = this.f15892d;
        if (i12 > 7) {
            i12 -= 17;
        } else if (this.f15895g == 1) {
            i12 -= this.f15896h - 1;
        }
        return new A1.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i12, 1, Integer.MIN_VALUE, f7, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f15891c);
        int length = spannableStringBuilder.length();
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        boolean z7 = false;
        while (true) {
            ArrayList arrayList = this.a;
            if (i11 >= arrayList.size()) {
                break;
            }
            C2035a c2035a = (C2035a) arrayList.get(i11);
            boolean z8 = c2035a.f15888b;
            int i13 = c2035a.a;
            if (i13 != 8) {
                boolean z9 = i13 == 7;
                if (i13 != 7) {
                    i10 = C2037c.f15898B[i13];
                }
                z7 = z9;
            }
            int i14 = c2035a.f15889c;
            i11++;
            if (i14 != (i11 < arrayList.size() ? ((C2035a) arrayList.get(i11)).f15889c : length)) {
                if (i7 != -1 && !z8) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i7, i14, 33);
                    i7 = -1;
                } else if (i7 == -1 && z8) {
                    i7 = i14;
                }
                if (i8 != -1 && !z7) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i8, i14, 33);
                    i8 = -1;
                } else if (i8 == -1 && z7) {
                    i8 = i14;
                }
                if (i10 != i9) {
                    if (i9 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i9), i12, i14, 33);
                    }
                    i9 = i10;
                    i12 = i14;
                }
            }
        }
        if (i7 != -1 && i7 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
        }
        if (i8 != -1 && i8 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i8, length, 33);
        }
        if (i12 != length && i9 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i9), i12, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.a.isEmpty() && this.f15890b.isEmpty() && this.f15891c.length() == 0;
    }
}
