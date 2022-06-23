# Test Cases

## Headers

# This is a Heading h1
## This is a Heading h2 
###### This is a Heading h6

## Emphasis


_You **can** combine them_

## Lists

### Unordered

* Item 1
* Item 2
* Item 2a
* Item 2b

### Ordered

1. Item 1
1. Item 2
1. Item 3
  1. Item 3a
  1. Item 3b

## Images

![This is a alt text.](/image/sample.png "This is a sample image.")

## Links

You may be using [Markdown Live Preview](https://markdownlivepreview.com/).

## Blockquotes

> Markdown is a lightweight markup language with plain-text-formatting syntax, created in 2004 by John Gruber with Aaron Swartz.
>
>> Markdown is often used to format readme files, for writing messages in online discussion forums, and to create rich text using a plain text editor.

## Test Cases

| No. | Name |Steps|Expected Results|Preconditions|Test Data|Priority|
|--|:------------------------:|------|:------:|:------:|:----:|:----:|
|1|Verify search working by adding keyword and pressing the Enter key from the keyboard.||
|2 | Verify the search field present and aligned.||
|3|Verify search working by adding keyword and on click on the search button.|right baz     |
|4|Verify an error message should display for blank input.|right baz     |
|5|Verify related keywords added to the search result or not.|right baz     |
|6|Verify auto suggestion shown on adding a keyword or not.|right baz     |
|7|Verify search icon is present on the field.|right baz     |
|4|Verify an error message should display for blank input.|right baz     |
|4|Verify an error message should display for blank input.|right baz     |
|4|Verify an error message should display for blank input.|right baz     |
|4|Verify an error message should display for blank input.|right baz     |




| Tables   |      Are      |  Cool |
|----------|:-------------:|------:|
| col 1 is |  centered mmmmmm| $1600 |
| col 2 is |    xs   |   $12 |
| col 3 is | right-aligned |    $1 |
    

```
let message = 'Hello world';
alert(message);
```

## Inline code

This web site is using `markedjs/marked`.