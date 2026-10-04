package i1;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.kusukanime.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: i1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1066t {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f11982d = new ArrayList();
    public WeakHashMap a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f11983b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f11984c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewA = a(viewGroup.getChildAt(childCount));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
