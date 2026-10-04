package p1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p.I0;

/* loaded from: classes.dex */
public final class t implements Spannable {
    public boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f14200b;

    public t(Spannable spannable) {
        this.f14200b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f14200b;
        if (!this.a) {
            if ((Build.VERSION.SDK_INT < 28 ? new I0(4) : new s(4)).w(spannable)) {
                this.f14200b = new SpannableString(spannable);
            }
        }
        this.a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f14200b.charAt(i7);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f14200b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f14200b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f14200b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f14200b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f14200b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i7, int i8, Class cls) {
        return this.f14200b.getSpans(i7, i8, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f14200b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i7, int i8, Class cls) {
        return this.f14200b.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f14200b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i7, int i8, int i9) {
        a();
        this.f14200b.setSpan(obj, i7, i8, i9);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        return this.f14200b.subSequence(i7, i8);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f14200b.toString();
    }
}
