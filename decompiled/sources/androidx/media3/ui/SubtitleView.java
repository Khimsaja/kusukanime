package androidx.media3.ui;

import A1.a;
import A1.b;
import A1.f;
import F2.C0147c;
import F2.C0148d;
import F2.L;
import F2.T;
import P3.F;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public List f10761k;

    /* renamed from: l, reason: collision with root package name */
    public C0148d f10762l;

    /* renamed from: m, reason: collision with root package name */
    public float f10763m;

    /* renamed from: n, reason: collision with root package name */
    public float f10764n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10765o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10766p;

    /* renamed from: q, reason: collision with root package name */
    public int f10767q;

    /* renamed from: r, reason: collision with root package name */
    public L f10768r;

    /* renamed from: s, reason: collision with root package name */
    public View f10769s;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10761k = Collections.EMPTY_LIST;
        this.f10762l = C0148d.f2316g;
        this.f10763m = 0.0533f;
        this.f10764n = 0.08f;
        this.f10765o = true;
        this.f10766p = true;
        C0147c c0147c = new C0147c(context);
        this.f10768r = c0147c;
        this.f10769s = c0147c;
        addView(c0147c);
        this.f10767q = 1;
    }

    private List<b> getCuesWithStylingPreferencesApplied() {
        if (this.f10765o && this.f10766p) {
            return this.f10761k;
        }
        ArrayList arrayList = new ArrayList(this.f10761k.size());
        for (int i7 = 0; i7 < this.f10761k.size(); i7++) {
            a aVarA = ((b) this.f10761k.get(i7)).a();
            if (!this.f10765o) {
                aVarA.f50n = false;
                CharSequence charSequence = aVarA.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        aVarA.a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = aVarA.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof f)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                F.Q(aVarA);
            } else if (!this.f10766p) {
                F.Q(aVarA);
            }
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C0148d getUserCaptionStyle() {
        boolean zIsInEditMode = isInEditMode();
        C0148d c0148d = C0148d.f2316g;
        if (zIsInEditMode) {
            return c0148d;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            c0148d = new C0148d(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return c0148d;
    }

    private <T extends View & L> void setView(T t7) {
        removeView(this.f10769s);
        View view = this.f10769s;
        if (view instanceof T) {
            ((T) view).f2304l.destroy();
        }
        this.f10769s = t7;
        this.f10768r = t7;
        addView(t7);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.f10768r.a(getCuesWithStylingPreferencesApplied(), this.f10762l, this.f10763m, this.f10764n);
    }

    public void setApplyEmbeddedFontSizes(boolean z7) {
        this.f10766p = z7;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z7) {
        this.f10765o = z7;
        c();
    }

    public void setBottomPaddingFraction(float f5) {
        this.f10764n = f5;
        c();
    }

    public void setCues(List<b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f10761k = list;
        c();
    }

    public void setFractionalTextSize(float f5) {
        this.f10763m = f5;
        c();
    }

    public void setStyle(C0148d c0148d) {
        this.f10762l = c0148d;
        c();
    }

    public void setViewType(int i7) {
        if (this.f10767q == i7) {
            return;
        }
        if (i7 == 1) {
            setView(new C0147c(getContext()));
        } else {
            if (i7 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new T(getContext()));
        }
        this.f10767q = i7;
    }
}
