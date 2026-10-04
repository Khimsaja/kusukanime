package androidx.media3.ui;

import C2.C0034g;
import F2.N;
import F2.O;
import F2.P;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import y1.Q;
import y1.S;
import y1.W;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public final int f10770k;

    /* renamed from: l, reason: collision with root package name */
    public final LayoutInflater f10771l;

    /* renamed from: m, reason: collision with root package name */
    public final CheckedTextView f10772m;

    /* renamed from: n, reason: collision with root package name */
    public final CheckedTextView f10773n;

    /* renamed from: o, reason: collision with root package name */
    public final O f10774o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f10775p;

    /* renamed from: q, reason: collision with root package name */
    public final HashMap f10776q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10777r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10778s;

    /* renamed from: t, reason: collision with root package name */
    public N f10779t;

    /* renamed from: u, reason: collision with root package name */
    public CheckedTextView[][] f10780u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10781v;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f10770k = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f10771l = layoutInflaterFrom;
        O o7 = new O(this);
        this.f10774o = o7;
        this.f10779t = new C0034g(getResources());
        this.f10775p = new ArrayList();
        this.f10776q = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f10772m = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.kusukanime.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(o7);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.kusukanime.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f10773n = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.kusukanime.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(o7);
        addView(checkedTextView2);
    }

    public final void a() {
        this.f10772m.setChecked(this.f10781v);
        boolean z7 = this.f10781v;
        HashMap map = this.f10776q;
        this.f10773n.setChecked(!z7 && map.size() == 0);
        for (int i7 = 0; i7 < this.f10780u.length; i7++) {
            S s7 = (S) map.get(((W) this.f10775p.get(i7)).f18012b);
            int i8 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f10780u[i7];
                if (i8 < checkedTextViewArr.length) {
                    if (s7 != null) {
                        Object tag = checkedTextViewArr[i8].getTag();
                        tag.getClass();
                        this.f10780u[i7][i8].setChecked(s7.f17973b.contains(Integer.valueOf(((P) tag).f2302b)));
                    } else {
                        checkedTextViewArr[i8].setChecked(false);
                    }
                    i8++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f10775p;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f10773n;
        CheckedTextView checkedTextView2 = this.f10772m;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f10780u = new CheckedTextView[arrayList.size()][];
        boolean z7 = this.f10778s && arrayList.size() > 1;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            W w7 = (W) arrayList.get(i7);
            boolean z8 = this.f10777r && w7.f18013c;
            CheckedTextView[][] checkedTextViewArr = this.f10780u;
            int i8 = w7.a;
            checkedTextViewArr[i7] = new CheckedTextView[i8];
            P[] pArr = new P[i8];
            for (int i9 = 0; i9 < w7.a; i9++) {
                pArr[i9] = new P(w7, i9);
            }
            for (int i10 = 0; i10 < i8; i10++) {
                LayoutInflater layoutInflater = this.f10771l;
                if (i10 == 0) {
                    addView(layoutInflater.inflate(com.kusukanime.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z8 || z7) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f10770k);
                N n7 = this.f10779t;
                P p7 = pArr[i10];
                checkedTextView3.setText(((C0034g) n7).o(p7.a.f18012b.f17971d[p7.f2302b]));
                checkedTextView3.setTag(pArr[i10]);
                if (w7.a(i10)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f10774o);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f10780u[i7][i10] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.f10781v;
    }

    public Map<Q, S> getOverrides() {
        return this.f10776q;
    }

    public void setAllowAdaptiveSelections(boolean z7) {
        if (this.f10777r != z7) {
            this.f10777r = z7;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z7) {
        if (this.f10778s != z7) {
            this.f10778s = z7;
            if (!z7) {
                HashMap map = this.f10776q;
                if (map.size() > 1) {
                    ArrayList arrayList = this.f10775p;
                    HashMap map2 = new HashMap();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        S s7 = (S) map.get(((W) arrayList.get(i7)).f18012b);
                        if (s7 != null && map2.isEmpty()) {
                            map2.put(s7.a, s7);
                        }
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z7) {
        this.f10772m.setVisibility(z7 ? 0 : 8);
    }

    public void setTrackNameProvider(N n7) {
        n7.getClass();
        this.f10779t = n7;
        b();
    }
}
