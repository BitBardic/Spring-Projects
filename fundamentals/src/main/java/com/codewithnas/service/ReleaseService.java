package com.codewithnas.service;

import com.codewithnas.entity.Release;

public interface ReleaseService {
    Iterable<Release> listReleases();
}
