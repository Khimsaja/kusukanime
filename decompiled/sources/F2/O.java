package F2;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.media3.ui.TrackSelectionView;
import java.util.ArrayList;
import java.util.HashMap;
import y1.W;

/* loaded from: classes.dex */
public final class O implements View.OnClickListener {
    public final /* synthetic */ TrackSelectionView a;

    public O(TrackSelectionView trackSelectionView) {
        this.a = trackSelectionView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TrackSelectionView trackSelectionView = this.a;
        HashMap map = trackSelectionView.f10776q;
        boolean z7 = true;
        if (view == trackSelectionView.f10772m) {
            trackSelectionView.f10781v = true;
            map.clear();
        } else if (view == trackSelectionView.f10773n) {
            trackSelectionView.f10781v = false;
            map.clear();
        } else {
            trackSelectionView.f10781v = false;
            Object tag = view.getTag();
            tag.getClass();
            P p7 = (P) tag;
            W w7 = p7.a;
            y1.Q q6 = w7.f18012b;
            y1.S s7 = (y1.S) map.get(q6);
            int i7 = p7.f2302b;
            if (s7 == null) {
                if (!trackSelectionView.f10778s && map.size() > 0) {
                    map.clear();
                }
                map.put(q6, new y1.S(q6, j3.G.w(Integer.valueOf(i7))));
            } else {
                ArrayList arrayList = new ArrayList(s7.f17973b);
                boolean zIsChecked = ((CheckedTextView) view).isChecked();
                boolean z8 = trackSelectionView.f10777r && w7.f18013c;
                if (!z8 && (!trackSelectionView.f10778s || trackSelectionView.f10775p.size() <= 1)) {
                    z7 = false;
                }
                if (zIsChecked && z7) {
                    arrayList.remove(Integer.valueOf(i7));
                    if (arrayList.isEmpty()) {
                        map.remove(q6);
                    } else {
                        map.put(q6, new y1.S(q6, arrayList));
                    }
                } else if (!zIsChecked) {
                    if (z8) {
                        arrayList.add(Integer.valueOf(i7));
                        map.put(q6, new y1.S(q6, arrayList));
                    } else {
                        map.put(q6, new y1.S(q6, j3.G.w(Integer.valueOf(i7))));
                    }
                }
            }
        }
        trackSelectionView.a();
    }
}
